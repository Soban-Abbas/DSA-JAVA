public class scannerConcept {
   public static void main(String[] args) {
//         🧠 1. Terminal input actually hota kya hai?

// Jab tum type karte ho:

// 10 (ENTER)
// 3.5 (ENTER)
// Hello World (ENTER)

// 👉 Java isko internally aise store karta hai:

// 10\n3.5\nHello World\n

// 👉 yaad rakh:

// \n = ENTER key
// har line ke end pe \n hota hai
// 🧠 2. Scanner ke 2 types ke methods
// 🔵 (A) Number wale methods
// nextInt()
// nextDouble()

// 👉 yeh:
// ✔️ sirf number uthate hain
// ❌ \n (ENTER) chhor dete hain

// 🟢 (B) Line wala method
// nextLine()

// 👉 yeh:
// ✔️ poori line uthata hai jab tak \n mile

// 🔥 3. Actual problem kaha hoti hai?
// Example:
// int a = sc.nextInt();
// String s = sc.nextLine();
// Input:
// 10 (ENTER)
// Ali (ENTER)
// 🔴 Step-by-step
// 1️⃣ nextInt()
// leta hai: 10
// chhor deta hai: \n

// 👉 buffer:

// \nAli\n
// 2️⃣ nextLine()
// kya karega?
// 👉 pehla \n dekha → wahi uthaya

// 👉 result:

// s = ""

// 💥 isliye string empty aati hai

// ✅ 4. FIX ka logic
// int a = sc.nextInt();
// sc.nextLine(); // 👈 leftover \n hata diya

// String s = sc.nextLine(); // ab real input lega
// 🔍 Step-by-step fix
// 1️⃣ nextInt()

// buffer:

// \nAli\n
// 2️⃣ extra nextLine()
// uthaya: \n

// buffer:

// Ali\n
// 3️⃣ real nextLine()
// uthaya: "Ali"

// ✅ correct

// 🧠 5. Tumhari line ko correct karta hoon

// Tumne bola:

// int and double always skip \n and nextline pick the line till it found \n even its first found

// 👉 ✔️ YES — bilkul sahi, bas thoda clean version:

// ✅ FINAL RULE (perfect samajh lo)
// nextInt() / nextDouble()
// 👉 number lete hain
// 👉 \n chhor dete hain
// nextLine()
// 👉 jab tak \n na mile tab tak sab uthata hai
// 👉 agar pehla hi \n ho → empty string deta hai
// 👉 warna poori line deta hai (e.g. "Hello World")
// 🟢 6. Sentence ka case

// Input:

// Hello World (ENTER)
// String s = sc.nextLine();

// 👉 output:

// s = "Hello World"

// ✔️ poora sentence milta hai

// 🔴 7. next() vs nextLine()
// sc.next();      // "Hello"
// sc.nextLine();  // "Hello World"
// 🎯 FINAL SUMMARY (1 min revision)

// 👉 Java input = data + \n
// 👉 number methods → \n chhor dete hain
// 👉 nextLine() → \n tak sab uthata hai
// 👉 agar pehla hi \n ho → empty string

// 👉 FIX:

// nextInt();
// nextLine(); // clear buffer
// nextLine(); // real input
   }
 }
