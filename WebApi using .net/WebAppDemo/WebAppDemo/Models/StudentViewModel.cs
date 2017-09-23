﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace WebAppDemo.Models
{
    public class StudentViewModel
    {
        public int Id { get; set; }
        public string FirstName { get; set; }
       // public string LastName { get; set; }
       public int? StandardId { get; set; }

        public AddressViewModel Address { get; set; }
        public StandardViewModel Standard { get; set; }

    }
}