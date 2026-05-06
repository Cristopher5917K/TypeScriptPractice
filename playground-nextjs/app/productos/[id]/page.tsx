'use client';

import React from 'react';
import { useParams } from 'next/navigation';
import Link from 'next/link';

export default function DetailPage() {
  const params = useParams();
  const id = params?.id;

  return (
    <div className="min-h-screen bg-white dark:bg-black">
      <div className="container mx-auto py-12 px-4">
        <Link
          href="/"
          className="inline-flex items-center text-blue-600 hover:text-blue-800 mb-6"
        >
          ← Volver al inicio
        </Link>

        <div className="bg-zinc-50 dark:bg-zinc-900 p-8 rounded-lg">
          <h1 className="text-4xl font-bold text-gray-900 dark:text-white mb-4">
            Detalle: {id}
          </h1>
          
          <div className="grid grid-cols-1 md:grid-cols-2 gap-8 mt-8">
            <div className="bg-white dark:bg-zinc-800 p-6 rounded-lg">
              <h2 className="text-xl font-semibold text-gray-900 dark:text-white mb-4">
                Información del Ítem
              </h2>
              <div className="space-y-3 text-gray-700 dark:text-gray-300">
                <p><strong>ID:</strong> {id}</p>
                <p><strong>Tipo:</strong> Producto/Recurso</p>
                <p><strong>Estado:</strong> Activo</p>
              </div>
            </div>

            <div className="bg-white dark:bg-zinc-800 p-6 rounded-lg">
              <h2 className="text-xl font-semibold text-gray-900 dark:text-white mb-4">
                Acciones
              </h2>
              <div className="space-y-3">
                <button className="w-full bg-blue-600 text-white px-4 py-2 rounded hover:bg-blue-700 transition">
                  Editar
                </button>
                <button className="w-full bg-red-600 text-white px-4 py-2 rounded hover:bg-red-700 transition">
                  Eliminar
                </button>
              </div>
            </div>
          </div>

          <div className="mt-8 bg-white dark:bg-zinc-800 p-6 rounded-lg">
            <h2 className="text-xl font-semibold text-gray-900 dark:text-white mb-4">
              Descripción Detallada
            </h2>
            <p className="text-gray-700 dark:text-gray-300 leading-relaxed">
              Este es el detalle para el ítem con ID: <strong>{id}</strong>. 
              Aquí puedes ver toda la información relacionada con este recurso específico.
              La página se renderiza dinámicamente basándose en el parámetro de ruta.
            </p>
          </div>
        </div>
      </div>
    </div>
  );
}
