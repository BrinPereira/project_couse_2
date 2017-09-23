using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Web;

namespace Ch24ShoppingCartMVC.Models
{
    public class CheckoutViewModel
    {
        public const decimal Tax = 7.5m;        
        public decimal SubTotal { get; set; }
        public decimal Total { get; set; }
        [DisplayName("Credit Card Type")]
        public string CreditType { get; set; }
        [DisplayName("Credit Card Number")]
        public string CardNumber { get; set; }

        public CustomerViewModel Customer { get; set; }
        public CartViewModel ProductInCart { get; set; }
    }
}