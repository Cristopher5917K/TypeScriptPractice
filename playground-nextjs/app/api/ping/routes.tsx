import { NextRequest, NextResponse } from 'next/server';

export async function GET(request: NextRequest) {
  return NextResponse.json(
    {
      message: 'Pong!',
      timestamp: new Date().toISOString(),
    },
    { status: 200 }
  );
}

export async function POST(request: NextRequest) {
  const body = await request.json();
  return NextResponse.json(
    {
      message: 'Pong!',
      received: body,
      timestamp: new Date().toISOString(),
    },
    { status: 200 }
  );
}
