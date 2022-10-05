package com.driver;
class Product{
        public int product(int x,int y) {
            return x*y;
        }
        public int product(int x,int y,int z) {
            return x*y*z;
        }
    }
public class Main {
    
    public static void main(String[]args) {
        Product p=new Product();
        p.product(5,6);
        p.product(5,6,7);
    }
    
  }
