using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CustomCarBuilt
{
    abstract class CarDecorator : Car
    {
        protected Car decoratorcar;

        public CarDecorator(Car decoratorcar)
        {
            this.decoratorcar = decoratorcar;
        }

        public override void price()
        {
            decoratorcar.price();
        }
    }
}
