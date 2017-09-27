using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CustomCarBuilt
{
    class V12engine : CarDecorator
    {
        public V12engine(Car decoratorcar) : base(decoratorcar)
        {
            decoratorcar.error = "";
        }

        public override void price()
        {
            setV12enginePrice(decoratorcar);
        }

        public void setV12enginePrice(Car decoratorcar)
        {
            if (decoratorcar.model == "E")
            {
                decoratorcar.cost = decoratorcar.cost + 6000;
            }
            else
            {
                if (decoratorcar.model == "CS")
                {
                    decoratorcar.cost = decoratorcar.cost + 6000;
                }
                else
                {
                    decoratorcar.error = "V-12 engine not available for the model";
                }
            }
        }
    }
}
