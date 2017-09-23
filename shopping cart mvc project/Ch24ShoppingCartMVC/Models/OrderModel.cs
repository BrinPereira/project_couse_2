using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using Ch24ShoppingCartMVC.Models;
using Ch24ShoppingCartMVC.Models.DataAccess;
using System.Data.Entity;

namespace Ch24ShoppingCartMVC.Models
{
    public class OrderModel
    {
        private List<ProductViewModel> products;

        //Implement GetAllProductsFromDataStore
        public List<Product> GetAllProductsFromDataStore()
        {
            //Brin
            using (HalloweenEntities data = new HalloweenEntities())
            {  //get all the products from the Collection Products order by name using HalloweenEntities

                return
                    (
                    from p in data.Products
                    orderby p.Name
                    select p
                    ).ToList<Product>();
            }
        }

        //Implement the method ConvertToViewModel
        private ProductViewModel ConvertToViewModel(Product product)
        {
            //Brin
            ProductViewModel model = new ProductViewModel();
            model.ProductID = product.ProductID;
            model.Name = product.Name;
            model.ShortDescription = product.ShortDescription;
            model.LongDescription = product.LongDescription;
            model.UnitPrice = product.UnitPrice;
            model.ImageFile = product.ImageFile;
            //model.Quantity = product.LineItems --- On hold
            return model;
        }

        //Implement the method GetProductList  
        // Brin
        public List<ProductViewModel> GetProductsList()
        {
            if (this.products == null)
            {
                //Call the method GetAllProducts
                products = GetAllProducts();
            }
            //Return the products
            return products;
        }

        // Brin
        public List<ProductViewModel> GetAllProducts()
        {
            List<ProductViewModel> productmodels = new List<ProductViewModel>();

            // Call the GetAllProductsFromDataStore() 
            List<Product> products = GetAllProductsFromDataStore();

            foreach (Product p in products)
            {  //Call the method ConvertToViewModel to convert p and pass the method ConvertToViewModel to the method
               //add of the productmodels
                productmodels.Add(ConvertToViewModel(p));
            }
            return productmodels;
        }

        // Brin
        public Product GetProductByIdFromDataStore(string id)
        {
            using (HalloweenEntities data = new HalloweenEntities())
            {
                //Get a product from Products of data where ProductID is matched with id parameter
                return
                    (
                    from product in data.Products
                    where product.ProductID == id
                    select product
                    ).FirstOrDefault();
            }
        }

        // Brin
        public OrderViewModel GetOrderInfo(string id)
        {
            OrderViewModel order = new OrderViewModel();
            //Call the method GetSelectedProduct and assign the return value to SelectedProduct property
            order.SelectedProduct = GetSelectedProduct(id);
            return order;
        }

        // Brin
        public ProductViewModel GetSelectedProduct(string id)
        {
            if (this.products == null)
                //call the method ConvertToViewModel and pass the method GetProductByIdFromDataStore(id)
                return ConvertToViewModel(GetProductByIdFromDataStore(id));
            else
            {
                //Get the product from the products where ProductID is matched with id (Using Lambda expression)
                using (var data = new HalloweenEntities())
                    return ConvertToViewModel((data.Products.Where<Product>(p => p.ProductID == id)).FirstOrDefault<Product>());
            }
        }
    }
}