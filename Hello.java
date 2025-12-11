
// How to install Java, set up VS Code, install Code Runner, create a class, and run Java code?

// -----------------------------------------------------
// Java Installation
// -----------------------------------------------------

// 1. First, search “Java JDK download” in any browser.
// 2. Go to the official Java website (Oracle or OpenJDK) and download the latest Java JDK.
// 3. After downloading, install Java on your system.

// -----------------------------------------------------
// VS Code Installation
// -----------------------------------------------------

// 4. Now search “VS Code download” in your browser.
// 5. Go to the official website of VS Code and download the latest version.
// 6. Install VS Code after downloading.

// 7. Now both Java and VS Code are installed on your computer.

// -----------------------------------------------------
// Set Java PATH in Environment Variables
// -----------------------------------------------------

// 8. Go to the C drive and open “Program Files”.
// 9. Open the Java folder → open the JDK folder → then open the “bin” folder.
// 10. Copy the full path of the bin folder.
// 11. Search “Environment Variables” in the Windows search bar.
// 12. Click on the “Environment Variables…” button.
// 13. In the System Variables section, find the “Path” variable.
// 14. Select it and double-click to edit it.
// 15. Click on “New” and paste the bin folder path you copied.
// 16. Click OK and save everything.

// -----------------------------------------------------
// Install Java Extension Pack + Code Runner
// -----------------------------------------------------

// 17. Open VS Code.
// 18. Click on the Extensions icon on the left sidebar.
// 19. Search for “Java Extension Pack” and install it.
// 20. Search for “Code Runner” and install the Code Runner extension.

// Code Runner allows you to run Java code with a single click.

// -----------------------------------------------------
// Create a Java Class File
// -----------------------------------------------------

// 21. Create a new file in VS Code.
// 22. Save it as “Hello.java”. (Note: File name must match the class name)
// 23. Write this code:

// public class Hello {
//     public static void main(String[] args) {
//         System.out.println("Hello Java!");
//     }
// }

// -----------------------------------------------------
// Run Java Code Using Terminal
// -----------------------------------------------------

// 24. Go to Terminal → New Terminal in VS Code.
// 25. First compile the code:
//     javac Hello.java
// 26. Then run the code:
//     java Hello

// -----------------------------------------------------
// Run Java Code Using Code Runner
// -----------------------------------------------------

// 27. Open the file and click on the “Run Code” button (top-right corner).
// 28. The output will appear in the Output section below.
// 29. If Java is not running, go to Settings → search “code runner executor map”
//     and verify the Java path is correct.

// -----------------------------------------------------
// Now your Java setup is fully complete.
// You can run Java using Terminal, Code Runner, or Java Extension Pack.
// -----------------------------------------------------


// কিভাবে Java ইনস্টল, VS Code সেটআপ, Code Runner ইনস্টল এবং কোড রান করতে হয়?

// 1. প্রথমে ব্রাউজারে “Java JDK download” সার্চ করো।
// 2. Java-এর অফিসিয়াল ওয়েবসাইটে গিয়ে সর্বশেষ Java JDK ডাউনলোড করো।
// 3. ডাউনলোড হওয়ার পর Java সিস্টেমে ইনস্টল করো।

// 4. এবার ব্রাউজারে “VS Code download” সার্চ করো।
// 5. VS Code-এর অফিসিয়াল ওয়েবসাইটে গিয়ে সর্বশেষ ভার্সন ডাউনলোড করো।
// 6. ডাউনলোড শেষে VS Code ইনস্টল করো।

// 7. এখন Java এবং VS Code দুটোই সিস্টেমে ইনস্টল হয়ে গেছে।

// ------------------------------
// Java PATH সেট করা
// ------------------------------

// 8. C ড্রাইভে গিয়ে “Program Files” ওপেন করো।
// 9. Java ফোল্ডার ওপেন করো → JDK ফোল্ডার ওপেন করো → তারপর “bin” ফোল্ডার ওপেন করো।
// 10. bin ফোল্ডারের সম্পূর্ণ path কপি করো।
// 11. Windows এর সার্চ বার থেকে “Environment Variables” সার্চ করো।
// 12. “Environment Variables…” বাটনে ক্লিক করো।
// 13. System Variables সেকশনে “Path” সিলেক্ট করে ডাবল ক্লিক করো।
// 14. “New” চাপো এবং কপি করা path পেস্ট করো।
// 15. OK চাপো এবং সব সেভ করো।

// ------------------------------
// Java Extension + Code Runner Install
// ------------------------------

// 16. VS Code ওপেন করো।
// 17. বামের Extensions আইকনে ক্লিক করো।
// 18. সার্চ বারে “Java Extension Pack” লিখে ইনস্টল করো।
// 19. সার্চ বারে “Code Runner” লিখে **Code Runner** এক্সটেনশন ইনস্টল করো।

// Code Runner ইনস্টল করলে এক ক্লিকে Java কোড রান হবে।

// ------------------------------
// Java Class তৈরি করা
// ------------------------------

// 20. VS Code-এ একটি নতুন ফাইল তৈরি করো।
// 21. ফাইলটি save করো “Hello.java” নামে। (নোট: ফাইলের নাম = ক্লাসের নাম হতে হবে)
// 22. এরপর এই কোড লিখো:

// public class Hello {
//     public static void main(String[] args) {
//         System.out.println("Hello Java!");
//     }
// }

// ------------------------------
// Terminal দিয়ে Java কোড রান করা
// ------------------------------

// 23. VS Code-এ Terminal → New Terminal ক্লিক করো।
// 24. প্রথমে কোড compile করো:
//     javac Hello.java
// 25. এরপর রান করো:
//     java Hello

// ------------------------------
// Code Runner দিয়ে Java কোড রান করা
// ------------------------------

// 26. ফাইল ওপেন করে উপরে ডানদিকে "Run Code" বাটনে ক্লিক করো।
// 27. নিচে Output সেকশনে রেজাল্ট দেখাবে।
// 28. যদি দেখো Java রান না হচ্ছে, তাহলে File → Preferences → Settings-এ গিয়ে:
//     “code runner executor map” সার্চ করো এবং Java path ঠিক আছে কিনা দেখো।

// ------------------------------
// এখন তোমার Java সম্পূর্ণ সেটআপ শেষ।
// VS Code, Terminal, Code Runner — তিনভাবেই কোড রান করতে পারবে।
// ------------------------------
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello Java!");
    }
}
