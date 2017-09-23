using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using Ch24ShoppingCartMVC.Models.DataAccess;
using System.Data;
using System.Data.Entity.Validation;

namespace Ch24ShoppingCartMVC.Models
{
    public class CheckoutModel
    {
        public void CheckoutOrder(CheckoutViewModel model)
        {
            Invoice invoice = ConvertToModel(model);
            using (var dbContext = new HalloweenEntities())
            {
                try
                {
                    dbContext.Entry(invoice).State = EntityState.Added;
                    //dbContext.SaveChanges();
                    HttpContext.Current.Session["cart"] = null;
                }
                catch (DbEntityValidationException e)
                {
                    foreach (var eve in e.EntityValidationErrors)
                    {
                        Console.WriteLine("Entity of type \"{0}\" in state \"{1}\" has the following validation errors:",
                            eve.Entry.Entity.GetType().Name, eve.Entry.State);
                        foreach (var ve in eve.ValidationErrors)
                        {
                            Console.WriteLine("- Property: \"{0}\", Error: \"{1}\"",
                                ve.PropertyName, ve.ErrorMessage);
                        }
                    }
                    throw;
                }
            }
        }

        public Invoice ConvertToModel(CheckoutViewModel model)
        {
            Invoice invoice = new Invoice();
            invoice.CardNumber = model.CardNumber;
            invoice.CreditCardType = model.CreditType;
            invoice.CustEmail = model.Customer.Email;
            /*
            invoice.Customer.FirstName = model.Customer.Name;
            invoice.Customer.Email = model.Customer.Email;
            invoice.Customer.Address = model.Customer.Address;
            */
            invoice.SalesTax = CheckoutViewModel.Tax;
            invoice.Subtotal = model.SubTotal;
            invoice.Total = model.Total;
            invoice.ShipMethod = "UPS";
            invoice.OrderDate = DateTime.Now;
            return invoice;
        }

        public CheckoutViewModel GetCheckoutDetail(CartViewModel model)
        {
            CheckoutViewModel checkoutmodel = new CheckoutViewModel();
            checkoutmodel.ProductInCart = model;
            decimal subTotal = 0m;
            foreach (ProductViewModel product in model.Cart)
            {
                subTotal += product.Quantity * product.UnitPrice;
            }
            checkoutmodel.SubTotal = subTotal;
            checkoutmodel.Total = subTotal + (CheckoutViewModel.Tax * subTotal * 0.01m);

            return checkoutmodel;
        }
    }
}