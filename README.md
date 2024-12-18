# Custom Annotation for JSON Serialization

## 📄 Description
This program demonstrates how to serialize a Java object into a JSON file using a custom annotation `@JsonPath`. The annotation specifies the directory where the JSON file will be stored. The program creates the directory if it doesn't exist, and saves the serialized object in a `.json` file.

### Functionality
1. **Custom Annotation:**
    - The `@JsonPath` annotation is applied to the `Person` class.
    - The annotation specifies the directory where the JSON file will be saved.
2. **Serialization:**
    - The `SerialJson` class uses Jackson's `ObjectMapper` to serialize the `Person` object into JSON.
    - The file is saved in the directory specified in the annotation (`output`).
    - If the directory does not exist, it is created automatically.

---

## 💻 Technologies Used
- **Java 17**
- **Jackson (for JSON serialization)**
- **IDE Recommended:** IntelliJ IDEA or any Java-compatible IDE.

---

## 📋 Requirements
- **Java Development Kit (JDK):** Version 17 or higher.
- **Jackson Databind:** Ensure the Jackson library is included in your project dependencies.

---

## 🛠️ Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/eze-ms/Annotations-N2-E1
