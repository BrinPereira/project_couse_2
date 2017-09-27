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
    public partial class CustomCarBuilt : Form
    {
        Car objCar;
        string ErrorMsg;
        string selectedoption = "";
        public CustomCarBuilt()
        {
            InitializeComponent();
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void comboBox2_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (cmbSelectCar.SelectedIndex != 0)
            {
                if (cmbSelectCar.SelectedItem.ToString() == "C")
                    objCar = new Car_C();
                else if (cmbSelectCar.SelectedItem.ToString() == "E")
                    objCar = new CarE();
                else if (cmbSelectCar.SelectedItem.ToString() == "CS")
                    objCar = new Car_CS();
            }
            if (objCar != null)
            {
                objCar.model = cmbSelectCar.SelectedItem.ToString();
                objCar.price();
            }

        }

        private void CustomCarBuilt_Load(object sender, EventArgs e)
        {
            cmbSelectCar.SelectedIndex = 0;
        }

        private void groupBox2_Enter(object sender, EventArgs e)
        {

        }

        private void Calculate_Click(object sender, EventArgs e)
        {
            selectedoption += objCar.model + " With ";
            ErrorMsg += "Enter car model: " + cmbSelectCar.SelectedItem.ToString() + "\r\n";
            if (rdv8yes.Checked == true)
            {
                Car objCarDecor = new V8engine(objCar);
                objCarDecor.price();
                ErrorMsg += "\tOption: V - 8\r\n";
                if (objCar.error != "")
                    ErrorMsg += "\t\tError: " + objCar.error + "\r\n";
                else
                    selectedoption += "V-8 ,";

            }
            if (rdv12yes.Checked == true)
            {
                Car objCarDecor = new V12engine(objCar);
                objCarDecor.price();
                ErrorMsg += "\tOption: V - 12\r\n";
                if (objCar.error != "")
                    ErrorMsg += "\t\tError: " + objCar.error + "\r\n";
                else
                    selectedoption += "V-12 ,";
            }
            if (rdsryes.Checked == true)
            {
                Car objCarDecor = new Sunroof(objCar);
                objCarDecor.price();
                ErrorMsg += "\tOption: Sunroof\r\n";
                if (objCar.error != "")
                    ErrorMsg += "\t\tError: " + objCar.error + "\r\n";
                else
                    selectedoption += "Sunroof,";
            }
            if (rdtpyes.Checked == true)
            {
                Car objCarDecor = new TowingPackage(objCar);
                objCarDecor.price();
                ErrorMsg += "\tOption: Towing package\r\n";
                if (objCar.error != "")
                    ErrorMsg += "\t\tError: " + objCar.error + "\r\n";
                else
                    selectedoption += "Towing package,";
            }
            if (rdgtyes.Checked == true)
            {
                Car objCarDecor = new GasTank(objCar);
                objCarDecor.price();
                ErrorMsg += "\tOption: Oversized Gas Tank\r\n";
                if (objCar.error != "")
                    ErrorMsg += "\t\tError: " + objCar.error + "\r\n";
                else
                    selectedoption += "Oversized Gas Tank ,";
            }
            if (rdpsyes.Checked == true)
            {
                Car objCarDecor = new PumaSkin(objCar);
                objCarDecor.price();
                ErrorMsg += "\tOption: Puma Skin Seats\r\n";
                if (objCar.error != "")
                    ErrorMsg += "\t\tError: " + objCar.error + "\r\n";
                else
                    selectedoption += "Puma Skin Seats ,";
            }
            if (rdssyes.Checked == true)
            {
                Car objCarDecor = new SealSkinSeats(objCar);
                objCarDecor.price();
                ErrorMsg += "\tOption: Seal Skin Seats\r\n";
                if (objCar.error != "")
                    ErrorMsg += "\t\tError: " + objCar.error + "\r\n";
                else
                    selectedoption += "Seal Skin Seats";
            }
            if (rdkdsyes.Checked == true)
            {
                Car objCarDecor = new DragonSeats(objCar);
                objCarDecor.price();
                ErrorMsg += "\tOption: Komodo Dragon Skin Seats\r\n";
                if (objCar.error != "")
                    ErrorMsg += "\t\tError: " + objCar.error + "\r\n";
                else
                    selectedoption += "Komodo Dragon Skin Seats ,";
            }
            if (rdcupyes.Checked == true)
            {
                Car objCarDecor = new CupHolder(objCar);
                objCarDecor.price();
                ErrorMsg += "\tOption:32oz Cup Holders\r\n";
                if (objCar.error != "")
                    ErrorMsg += "\t\tError: " + objCar.error + "\r\n";
                else
                    selectedoption += " 32oz cup Holders ,";

            }
            if (rdnyyes.Checked == true)
            {
                Car objCarDecor = new NYRadio(objCar);
                objCarDecor.price();
                ErrorMsg += "\tOption: Blaupunkt New York 800 Radio\r\n";
                if (objCar.error != "")
                    ErrorMsg += "\t\tError: " + objCar.error + "\r\n";
                else
                    selectedoption += " Blaupunkt New York 800 Radio ,";

            }
            if (rdstyes.Checked == true)
            {
                Car objCarDecor = new SpareTire(objCar);
                objCarDecor.price();
                 ErrorMsg += "\tOption: Spare Tire\r\n";
                if (objCar.error != "")
                    ErrorMsg += "\t\tError: " + objCar.error + "\r\n";
                else
                    selectedoption += "Spare Tire ,";
            }
            if (rdoilyes.Checked == true)
            {
                Car objCarDecor = new OilChange(objCar);
                objCarDecor.price();
                ErrorMsg += "\tOption: Free First Oil Change\r\n";
                if (objCar.error != "")
                    ErrorMsg += "\t\tError: " + objCar.error + "\r\n";
                else
                    selectedoption += "Free First Oil Change ,";
            }

            ErrorMsg += "\tOption: done\r\n";

            FinalForm finalForm = new FinalForm();
            finalForm.FinalCost = objCar.cost;
            finalForm.ErrorMsg = this.ErrorMsg;
            finalForm.selectedoption = this.selectedoption;
            finalForm.ShowDialog();

        }
    }
}
