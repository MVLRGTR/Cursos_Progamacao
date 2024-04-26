import { Inter } from "next/font/google";
import Calcimc from "./Calcimc/Calcimc";

const inter = Inter({ subsets: ["latin"] });

export default function Home() {
  return (
    <main className="flex w-full h-screen justify-start items-start">
      <Calcimc/>
    </main>
  );
}
