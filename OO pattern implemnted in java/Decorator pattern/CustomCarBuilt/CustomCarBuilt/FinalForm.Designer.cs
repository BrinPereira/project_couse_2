namespace CustomCarBuilt
{
    partial class FinalForm
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.Displaybox = new System.Windows.Forms.TextBox();
            this.labelTotalCost = new System.Windows.Forms.Label();
            this.labelPrice = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // Displaybox
            // 
            this.Displaybox.AccessibleRole = System.Windows.Forms.AccessibleRole.None;
            this.Displaybox.Location = new System.Drawing.Point(34, 65);
            this.Displaybox.Multiline = true;
            this.Displaybox.Name = "Displaybox";
            this.Displaybox.ScrollBars = System.Windows.Forms.ScrollBars.Vertical;
            this.Displaybox.Size = new System.Drawing.Size(480, 380);
            this.Displaybox.TabIndex = 0;
            this.Displaybox.Text = "output";
            // 
            // labelTotalCost
            // 
            this.labelTotalCost.AutoSize = true;
            this.labelTotalCost.Font = new System.Drawing.Font("Bookman Old Style", 20.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelTotalCost.Location = new System.Drawing.Point(31, 20);
            this.labelTotalCost.Name = "labelTotalCost";
            this.labelTotalCost.Size = new System.Drawing.Size(169, 32);
            this.labelTotalCost.TabIndex = 1;
            this.labelTotalCost.Text = "Total Cost:";
            this.labelTotalCost.Click += new System.EventHandler(this.labelTotalCost_Click);
            // 
            // labelPrice
            // 
            this.labelPrice.AutoSize = true;
            this.labelPrice.Font = new System.Drawing.Font("Bookman Old Style", 18F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.labelPrice.Location = new System.Drawing.Point(225, 23);
            this.labelPrice.Name = "labelPrice";
            this.labelPrice.Size = new System.Drawing.Size(76, 28);
            this.labelPrice.TabIndex = 2;
            this.labelPrice.Text = "Price";
            // 
            // FinalForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(656, 464);
            this.Controls.Add(this.labelPrice);
            this.Controls.Add(this.labelTotalCost);
            this.Controls.Add(this.Displaybox);
            this.Name = "FinalForm";
            this.Text = "FinalForm";
            this.Load += new System.EventHandler(this.FinalForm_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.TextBox Displaybox;
        private System.Windows.Forms.Label labelTotalCost;
        private System.Windows.Forms.Label labelPrice;
    }
}