using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CustomCarBuilt
{
    class CupHolder : CarDecorator
    {
        public CupHolder(Car decoratorcar) : base(decoratorcar)
        {
            decoratorcar.error = "";
        }

        public override void price()
        {
            setCupHolderPrice(decoratorcar);
        }

        public void setCupHolderPrice(Car decoratorcar)
        {
            if (decoratorcar.model == "C")
            {
                decoratorcar.cost = decoratorcar.cost + 1;
            }

            else if (decoratorcar.model == "E")
            {
                decoratorcar.cost = decoratorcar.cost + 1;
            }
            else
            {
                if (decoratorcar.model == "CS")
                {
                    decoratorcar.cost = decoratorcar.cost + 1;
                }
            }
        }
    }
}
