using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CustomCarBuilt
{
    abstract class Car
    {
        public int cost = 0;
        public string model;
        public string error = "";
        public abstract void price();
    }
}
