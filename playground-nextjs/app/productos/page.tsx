'use client';

import React, { useState } from 'react';
import Link from 'next/link';

interface Producto {
  id: number;
  nombre: string;
  precio: number;
  descripcion: string;
  stock: number;
}

export default function ProductosPage() {
  const [productos] = useState<Producto[]>([
    {
      id: 1,
      nombre: 'Laptop Pro',
      precio: 1299,
      descripcion: 'Laptop de alto rendimiento',
      stock: 5,
    },
    {
      id: 2,
      nombre: 'Mouse Inalámbrico',
      precio: 29,
      descripcion: 'Mouse inalámbrico ergonómico',
      stock: 15,
    },
    {
      id: 3,
      nombre: 'Teclado Mecánico',
      precio: 89,
      descripcion: 'Teclado mecánico RGB',
      stock: 8,
    },
    {
      id: 4,
      nombre: 'Monitor 4K',
      precio: 399,
      descripcion: 'Monitor UHD 4K 27 pulgadas',
      stock: 3,
    },
  ]);

  return (
    <div className="space-y-8">
      <div>
        <h2 className="text-3xl font-bold text-gray-900 dark:text-white mb-4">Nuestros Productos</h2>
        <p className="text-gray-600 dark:text-gray-400">Explora nuestro catálogo de productos de calidad</p>
      </div>

      <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-4 gap-6">
        {productos.map((producto) => (
          <Link
            key={producto.id}
            href={`/productos/${producto.id}`}
            className="group"
          >
            <div className="bg-white dark:bg-zinc-800 rounded-lg shadow hover:shadow-lg transition-shadow p-6 cursor-pointer">
              <h3 className="font-bold text-gray-900 dark:text-white mb-2 group-hover:text-blue-600">
                {producto.nombre}
              </h3>
              <p className="text-sm text-gray-600 dark:text-gray-400 mb-4">
                {producto.descripcion}
              </p>
              <div className="flex justify-between items-center">
                <span className="text-xl font-bold text-blue-600">${producto.precio}</span>
                <span className={`text-sm px-2 py-1 rounded ${
                  producto.stock > 0
                    ? 'bg-green-100 text-green-800'
                    : 'bg-red-100 text-red-800'
                }`}>
                  {producto.stock > 0 ? `${producto.stock} en stock` : 'Agotado'}
                </span>
              </div>
            </div>
          </Link>
        ))}
      </div>
    </div>
  );
}
