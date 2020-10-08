/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author meena
 */
public class ProductDB {
    private String filename;
    private ArrayList<Product> productList;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    private static ProductDB instance;

    public ProductDB() {
        productList = new ArrayList<Product>();
    }

    public static ProductDB getProductDB() {
        if(instance==null)
        {
            instance = new ProductDB();
        }
        return instance;
    }
    
    public void AddProduct(Product product)
    {
        productList.add(product);
    }
    public boolean FindProductByProductId(int id)
    {
        boolean value = false;
        this.LoadProducts();
   
  for(int i=0;i<this.productList.size();i++)
        {
           
        if(this.productList.get(i).getProductId() == id){
        value = true;
        break;
        }
        }
    return value;
    }
            
    public void SaveProducts()
    {
        
        try
        {
            File file =new File("products.txt");
            file.createNewFile();
            PrintWriter output = new PrintWriter(new FileOutputStream(file,true));
            for(Product p : productList)
            {
            output.println(p.toString());
            }
            output.close();
        }
        catch(Exception ex)
        {
        }
    }
    public void LoadProducts()
    {
                      try
        {
            File file = new File("products.txt");
            Scanner input;
            input = new Scanner(file);
            input.useDelimiter("[,\n]");
      
            while (input.hasNext()) {
                 Product p=new Product();
                 p.setProductId(Integer.parseInt(input.next()));
                 p.setProductName(input.next());
                 p.setProductPrice(Double.valueOf(input.next()));
                 p.setQuantity(Integer.valueOf(input.next()));
                 this.AddProduct(p);
                 System.out.println(p.toString());
            }   
            input.close();
            System.out.println("Products are Loaded");
        }
        catch(Exception ex)
        {
            Logger.getLogger(ProductDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
