using System.Linq.Expressions;

namespace ConsoleApp3
{
    internal class Program
    {
        static void Main()
        {
            {
                Console.WriteLine("¬ведите дату");

                var input = Console.ReadLine();
                if (DateTime.TryParse(input, out DateTime date))
                {
                    string season = GetSeason(date);
                    string DayOfWeek = date.DayOfWeek.ToString();
                    Console.WriteLine($"{season} {DayOfWeek}");
                }
                else
                {
                    Console.WriteLine("ќшибка ввода даты");
                }

                static string GetSeason(DateTime date) 
                {
                    int month = date.Month;
                    if (month == 12 || month < 3)
                        return "Winter";
                    else if (month < 6)
                        return "Spring";
                    else if (month < 9)
                        return "Summer";
                    else return "Autumn";
                }
            }
        }
    }
}
