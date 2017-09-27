using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CustomCarBuilt
{
    class OilChange : CarDecorator
    {
        public OilChange(Car decoratorcar) : base(decoratorcar)
        {
            decoratorcar.error = "";
        }

        public override void price()
        {
            setOilChangePrice(decoratorcar);
        }

        public void setOilChangePrice(Car decoratorcar)
        {
            if (decoratorcar.model == "C")
            {
                decoratorcar.cost = decoratorcar.cost + 75;
            }

            else if (decoratorcar.model == "E")
            {
                decoratorcar.cost = decoratorcar.cost + 75;
            }
            else
            {
                if (decoratorcar.model == "CS")
                {
                    decoratorcar.cost = decoratorcar.cost + 75;
                }
            }
        }
    }
}
