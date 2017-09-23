using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using Ch24ShoppingCartMVC.Models;

namespace Ch24ShoppingCartMVC.Models {
    public class CartViewModel
    {
        private List<ProductViewModel> _cart;

        public List<ProductViewModel> Cart
        {
            get
            {
                if (_cart == null)
                    _cart = new List<ProductViewModel>();
                return _cart;
            }
            set
            {
                _cart = value;
            }
        }

        public ProductViewModel AddedProduct { get; set; }
    }
}