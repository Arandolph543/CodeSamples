using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Diagnostics;
using System.Globalization;

namespace FloydWarshall
{
    class FloydWarshallAlgo
    {
        public const int cst = 9999;
        private static void Print(int[,] distance, int verticesCount)
        {
            Console.WriteLine("Shortest distance between every pair of vertices: ");
            for (int i = 0; i < verticesCount; ++i)
            {
                for (int j = 0; j < verticesCount; ++j)
                {
                    if (distance[i, j] == cst)
                        Console.WriteLine("cst".PadLeft(7) + " ");
                    else
                        Console.WriteLine(distance[i, j].ToString());
                }
            }
        }
        public static void FloydWarshall(int[,] graph, int verticesCount)
        {
            int[,] distance = new int[verticesCount, verticesCount];
            for (int i = 0; i < verticesCount; ++i)
                for (int j = 0; j < verticesCount; ++j)
                    distance[i, j] = graph[i, j];

            for (int k = 0;k<verticesCount;++k)
            {
                for(int i =0;i <verticesCount;++i)
                {
                    for(int j = 0;j<verticesCount;++j)
                    {
                        if (distance[i, k] + distance[k, j] < distance[i, j])
                            distance[i, j] = distance[i, k] + distance[k, j];
                    }
                }
            }
            Print(distance, verticesCount);
        }
        static void Main(string[] args)
        {
           int[,] graph = {{ 0,   6,  cst, 11 },
                            { cst, 0,   4, cst },
                            { cst, cst, 0,   2 },
                            { cst, cst, cst, 0 }
                           };
            FloydWarshall(graph, 4);
        }
    }
}
