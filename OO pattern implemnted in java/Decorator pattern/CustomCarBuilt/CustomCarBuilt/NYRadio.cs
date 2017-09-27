using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CustomCarBuilt
{
    class NYRadio : CarDecorator
    {
        public NYRadio(Car decoratorcar) : base(decoratorcar)
        {
            decoratorcar.error = "";
        }

        public override void price()
        {
            setNYRadioPrice(decoratorcar);
        }

        public void setNYRadioPrice(Car decoratorcar)
        {
            if (decoratorcar.model == "C ")
            {
                decoratorcar.cost = decoratorcar.cost + 900;
            }

            else if (decoratorcar.model == "E ")
            {
                decoratorcar.cost = decoratorcar.cost + 900;
            }
            else
            {
                if (decoratorcar.model == "CS")
                {
                    decoratorcar.cost = decoratorcar.cost + 900;
                }
            }
        }
    }
}
