using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http;
using System.Text;
using System.Threading.Tasks;
using WebAppDemo.Models;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {

            int repeat = 0;

            do
            {
                Console.WriteLine("Select following option : \n\r 1. Get Method  \n\r 2. Post Method \n\r " +
                                         "3. Put Method \n\r 4.Delete Method");
                int option = Convert.ToInt32(Console.ReadLine());

                switch (option)
                {
                    case 1:

                        using (var client = new HttpClient())
                        {
                            client.BaseAddress = new Uri("http://localhost:50296/api/studentm");
                            //HTTP GET
                            var responseTask = client.GetAsync("student");
                            responseTask.Wait();
                            var result = responseTask.Result;
                            if (result.IsSuccessStatusCode)
                            {
                                var readTask = result.Content.ReadAsAsync<Student[]>();
                                readTask.Wait();
                                var students = readTask.Result;
                                foreach (var student in students)
                                {
                                    Console.WriteLine(student.Id + " " + student.FirstName + "            " + student.StandardId);
                                }
                            }
                        }
                        break;

                    case 2:
                        using (var client = new HttpClient())
                        {
                            client.BaseAddress = new Uri("http://localhost:50296/api/studentm");
                            Console.WriteLine("Enter student Name ");
                            String sname = Console.ReadLine();
                            Console.WriteLine("Enter standardt id ");
                            int stid = Convert.ToInt32(Console.ReadLine());
                            var student = new Student() { FirstName = sname, StandardId = stid };
                            var postTask = client.PostAsJsonAsync("student", student);
                            postTask.Wait();
                            var result = postTask.Result;
                            if (result.IsSuccessStatusCode)
                            {
                                var readTask = result.Content.ReadAsAsync<Student>();
                                readTask.Wait();
                                var insertedStudent = readTask.Result;
                                Console.WriteLine("Added successfully");
                            }
                            else
                            {
                                Console.WriteLine(result.StatusCode);
                            }
                        }
                        break;

                    case 3:
                        using (var client = new HttpClient())
                        {
                            client.BaseAddress = new Uri("http://localhost:50296/api/studentm");
                            Console.WriteLine("Enter student id to edit  ");
                            int sid = Convert.ToInt32(Console.ReadLine());
                            Console.WriteLine("Enter student name to edit  ");
                            String sname = Console.ReadLine();
                            Console.WriteLine("Enter standard id to edit  ");
                            int stid = Convert.ToInt32(Console.ReadLine());
                            var student = new Student() { Id = sid, FirstName = sname, StandardId = stid };
                        //HTTP PUT
                            var putTask = client.PutAsJsonAsync<Student>("student", student);
                            putTask.Wait();
                            var result = putTask.Result;
                            if (result.IsSuccessStatusCode)
                            {
                             Console.WriteLine("updated successfully");
                            }
                            else
                             Console.WriteLine(result.StatusCode);
                        }
                        break;

                    case 4:
                        using (var client = new HttpClient())
                        {
                            Console.WriteLine("Enter student id to delete");
                            int sid = Convert.ToInt32(Console.ReadLine());
                            client.BaseAddress = new Uri("http://localhost:50296/api/studentm");
                            //HTTP DELETE
                            var deleteTask = client.DeleteAsync("student/" + sid.ToString());
                            deleteTask.Wait();
                            var result = deleteTask.Result;
                            if (result.IsSuccessStatusCode)
                            {
                                Console.WriteLine("Student deleted");
                            }
                            else
                            {
                                Console.WriteLine(result.StatusCode);
                            }
                        }

                        break;
                    default:

                        break;
                }               
                Console.WriteLine("Do you want to continue:/n/r press 1 for yes /n/r press 2 for no");
                repeat = Convert.ToInt32(Console.ReadLine());
            }
            while (repeat == 1);

        }
    }
}
