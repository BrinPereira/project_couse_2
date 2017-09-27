using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CustomCarBuilt
{
    class SpareTire : CarDecorator
    {
        public SpareTire(Car decoratorcar) : base(decoratorcar)
        {
            decoratorcar.error = "";
        }

        public override void price()
        {
            setSpareTirePrice(decoratorcar);
        }

        public void setSpareTirePrice(Car decoratorcar)
        {
            if (decoratorcar.model == "C")
            {
                decoratorcar.cost = decoratorcar.cost + 400;
            }

            else if (decoratorcar.model == "E")
            {
                decoratorcar.cost = decoratorcar.cost + 400;
            }
            else
            {
                if (decoratorcar.model == "CS")
                {
                    decoratorcar.cost = decoratorcar.cost + 400;
                }
            }
        }
    }
}
