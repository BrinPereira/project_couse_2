using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CustomCarBuilt
{
    class Sunroof : CarDecorator
    {
        public Sunroof(Car decoratorcar) : base(decoratorcar)
        {
            decoratorcar.error = "";
        }

        public override void price()
        {
            setsunroofPrice(decoratorcar);
        }

        public void setsunroofPrice(Car decoratorcar)
        {
            if (decoratorcar.model == "C")
            {
                decoratorcar.cost = decoratorcar.cost + 1900;
            }

            else if (decoratorcar.model == "E")
            {
                decoratorcar.cost = decoratorcar.cost + 2200;
            }
            else
            {
                if (decoratorcar.model == "CS")
                {
                    decoratorcar.cost = decoratorcar.cost + 3000;
                }
            }
        }
    }
}
