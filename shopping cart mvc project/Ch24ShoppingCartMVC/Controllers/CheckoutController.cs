using Ch24ShoppingCartMVC.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace Ch24ShoppingCartMVC.Controllers
{
    public class CheckoutController : Controller
    {
        private CheckoutModel checkout = new CheckoutModel();
        private CartModel cart = new CartModel();
        //
        // GET: /Checkout/
        [HttpGet]
        public ActionResult Index()
        {
            CheckoutViewModel checkoutModel = null;
            CartViewModel model = cart.GetCart();
            if (model != null && model.Cart != null && model.Cart.Count > 0)
                checkoutModel = checkout.GetCheckoutDetail(model);
            //Passing model to View
            return View(checkoutModel);
        }

        [HttpPost]
        public ActionResult Index(CheckoutViewModel checkoutview)
        {
            checkout.CheckoutOrder(checkoutview);
            return View();
        }

    }
}
