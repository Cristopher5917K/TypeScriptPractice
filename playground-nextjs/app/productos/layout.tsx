import React from 'react';

export default function ProductosLayout({
  children,
}: {
  children: React.ReactNode;
}) {
  return (
    <div className="min-h-screen">
      <nav className="bg-blue-600 text-white p-4">
        <h1 className="text-2xl font-bold">Tienda de Productos</h1>
      </nav>
      <main className="container mx-auto py-8 px-4">
        {children}
      </main>
    </div>
  );
}
