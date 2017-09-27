using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace CustomCarBuilt
{
    public partial class FinalForm : Form
    {
        public FinalForm()
        {
            InitializeComponent();
        }

        public int FinalCost { get; set; }
        public string ErrorMsg { get; set; }
        public string selectedoption { get; set; }

        private void FinalForm_Load(object sender, EventArgs e)
        {
            Displaybox.Text = ErrorMsg;
            Displaybox.Text += "\r\nNew Order:";
            Displaybox.Text += "\r\n\tCar :" + selectedoption;
            Displaybox.Text += "\r\n\tCost: $" + FinalCost.ToString();
            Displaybox.Text += "\r\nEnd Order";
            labelPrice.Text = FinalCost.ToString();
        }

        private void labelTotalCost_Click(object sender, EventArgs e)
        {

        }
    }
}
