'use client';

import React from 'react';

export default function ReportesPage() {
  return (
    <div className="space-y-6">
      <h2 className="text-3xl font-bold text-gray-900 dark:text-white">Reportes</h2>
      
      <div className="grid grid-cols-1 md:grid-cols-3 gap-4">
        <div className="bg-white dark:bg-zinc-800 p-6 rounded-lg shadow">
          <h3 className="font-semibold text-gray-900 dark:text-white mb-2">Reporte de Ventas</h3>
          <p className="text-gray-600 dark:text-gray-400">Análisis de ventas del mes</p>
          <button className="mt-4 bg-blue-600 text-white px-4 py-2 rounded hover:bg-blue-700">
            Ver Detalles
          </button>
        </div>

        <div className="bg-white dark:bg-zinc-800 p-6 rounded-lg shadow">
          <h3 className="font-semibold text-gray-900 dark:text-white mb-2">Reporte de Usuarios</h3>
          <p className="text-gray-600 dark:text-gray-400">Estadísticas de usuarios activos</p>
          <button className="mt-4 bg-blue-600 text-white px-4 py-2 rounded hover:bg-blue-700">
            Ver Detalles
          </button>
        </div>

        <div className="bg-white dark:bg-zinc-800 p-6 rounded-lg shadow">
          <h3 className="font-semibold text-gray-900 dark:text-white mb-2">Reporte de Productos</h3>
          <p className="text-gray-600 dark:text-gray-400">Inventario y stock</p>
          <button className="mt-4 bg-blue-600 text-white px-4 py-2 rounded hover:bg-blue-700">
            Ver Detalles
          </button>
        </div>
      </div>
    </div>
  );
}
