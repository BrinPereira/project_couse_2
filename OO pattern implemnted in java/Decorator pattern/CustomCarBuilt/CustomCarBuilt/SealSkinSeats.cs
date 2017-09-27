using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CustomCarBuilt
{
    class SealSkinSeats : CarDecorator
    {
        public SealSkinSeats(Car decoratorcar) : base(decoratorcar)
        {
            decoratorcar.error = "";
        }

        public override void price()
        {
            setSealSkinPrice(decoratorcar);
        }

        public void setSealSkinPrice(Car decoratorcar)
        {
            if (decoratorcar.model == "C")
            {
                decoratorcar.cost = decoratorcar.cost + 5600;
            }
            else
            {
                decoratorcar.error = "Seal skin Seats not available for the model";
            }
        }
    }
}
