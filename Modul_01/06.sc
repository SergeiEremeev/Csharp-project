using System.Linq.Expressions;

namespace ConsoleApp3
{
    internal class Program
    {
        static void Main()
        {
            {
                Console.WriteLine("Выберите, что хотите перевести: 1 - Цельсий в Фаренгейт, 2 - Фаренгейт в цельсий");
                 double number = Convert.ToInt32(Console.ReadLine());

                if (number < 1 || number > 2)
                {
                    Console.WriteLine("Ошибка: число должно быть 1 или 2");
                }
                else 
                {
                    Console.WriteLine("Введите, сколько вы хотите перевести");
                     double Temperatura = Convert.ToInt32(Console.ReadLine());
                    switch (number)
                    {
                        case 1:
                            Console.WriteLine((Temperatura * 9 / 5) + 32);
                        break;
                        case 2:
                            Console.WriteLine((Temperatura - 32) * 5 / 9); 
                        break;
                        default:
                        break;
                    }
                }
            }
        }
    }
}
