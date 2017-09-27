using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CustomCarBuilt
{
    class TowingPackage : CarDecorator
    {
        public TowingPackage(Car decoratorcar) : base(decoratorcar)
        {
            decoratorcar.error = "";
        }

        public override void price()
        {
            setTowingPrice(decoratorcar);
        }

        public void setTowingPrice(Car decoratorcar)
        {
            if (decoratorcar.model == "C")
            {
                decoratorcar.cost = decoratorcar.cost + 3000 ;
            }

            else if (decoratorcar.model == "E")
            {
                decoratorcar.cost = decoratorcar.cost + 3000;
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
