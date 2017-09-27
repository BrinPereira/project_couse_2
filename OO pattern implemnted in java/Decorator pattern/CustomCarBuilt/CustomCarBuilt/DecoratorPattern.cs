using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection;
using System.Text;
using System.Threading.Tasks;

namespace CustomCarBuilt
{
    class DecoratorPattern
    {
        public static void main()
        {
            Car test1 = new Car_C();
            Car test2 = new CarE();
            Car test3 = new Car_CS();

        }
    }

}
