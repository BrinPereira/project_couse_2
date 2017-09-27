using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CustomCarBuilt
{
    class V8engine : CarDecorator
    {
        public V8engine(Car decoratorcar) : base(decoratorcar)
        {
            decoratorcar.error = "";
        }

        public override void price()
        {
            setEnginePrice(decoratorcar);
        }

        public void setEnginePrice(Car decoratorcar)
        {
            if (decoratorcar.model == "C")
            {
                decoratorcar.cost = decoratorcar.cost + 4000;
            }
            else
            {
                decoratorcar.error = "V-8 not available for the model";
            }
        }


    }
}
