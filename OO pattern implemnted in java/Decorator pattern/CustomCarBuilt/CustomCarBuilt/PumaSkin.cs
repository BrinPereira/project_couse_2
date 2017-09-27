using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CustomCarBuilt
{
    class PumaSkin : CarDecorator
    {
        public PumaSkin(Car decoratorcar) : base(decoratorcar)
        {
            decoratorcar.error = "";
        }

        public override void price()
        {  
            setPumaSkinPrice(decoratorcar);
        }

        public void setPumaSkinPrice(Car decoratorcar)
        {
            if (decoratorcar.model=="E")
            {
                decoratorcar.cost = decoratorcar.cost + 700;
            }
            else
            {
                decoratorcar.error = "PUMA skin Seats not available for the model";
            }
        }
    }
}

