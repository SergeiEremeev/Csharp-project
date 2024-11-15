namespace ConsoleApp3
{
    internal class Program
    {
        static void Main()
        {
            {
                Console.WriteLine("Введите четыре цифры");
                Console.WriteLine("Число 1:");
                int number1 = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Число 2:");
                int number2 = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Число 3:");
                int number3 = Convert.ToInt32(Console.ReadLine());
                Console.WriteLine("Число 4:");
                int number4 = Convert.ToInt32(Console.ReadLine());

                Console.WriteLine("Получилось" + " " + number1 + number2 + number3 + number4);
          
            }
        }
    }
}
