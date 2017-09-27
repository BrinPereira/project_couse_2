using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CustomCarBuilt
{
    class DragonSeats : CarDecorator
    {
        public DragonSeats(Car decoratorcar) : base(decoratorcar)
        {
            decoratorcar.error = "";
        }

        public override void price()
        {
            setDragonSeatsPrice(decoratorcar);
        }

        public void setDragonSeatsPrice(Car decoratorcar)
        {
            if (decoratorcar.model == "CS")
            {
                decoratorcar.cost = decoratorcar.cost + 12000;
            }
            else
            {
                decoratorcar.error = "Komodo Dragon Seats not available for the model";
            }
        }

    }
}
