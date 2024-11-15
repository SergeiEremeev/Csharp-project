using System.Linq.Expressions;

namespace ConsoleApp3
{
    internal class Program
    {
        static void Main()
        {
            var str = Console.ReadLine();
            if (str.Length != 6)
            {
                Console.WriteLine("Error");
                return;
            }
            var pos1=Convert.ToInt32(Console.ReadLine());
            var pos2=Convert.ToInt32(Console.ReadLine());

            char[] digits=str.ToCharArray();

            char temp = digits[pos1];
            digits[pos1] = digits[pos2];
            digits[pos2] = temp;

            var result = new string(digits);

            Console.WriteLine(result);
        }
    }
}
