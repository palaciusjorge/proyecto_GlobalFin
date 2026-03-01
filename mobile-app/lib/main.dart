import 'package:flutter/material.dart';
import 'package:flutter_bloc/flutter_bloc.dart';

void main() {
  runApp(const GlobalFinApp());
}

class GlobalFinApp extends StatelessWidget {
  const GlobalFinApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'GlobalFin',
      debugShowCheckedModeBanner: false,
      theme: ThemeData(
        useMaterial3: true,
        colorScheme: ColorScheme.fromSeed(
          seedColor: const Color(0xFF1F77D2),
          brightness: Brightness.light,
        ),
        fontFamily: 'Roboto',
      ),
      darkTheme: ThemeData(
        useMaterial3: true,
        colorScheme: ColorScheme.fromSeed(
          seedColor: const Color(0xFF1F77D2),
          brightness: Brightness.dark,
        ),
        fontFamily: 'Roboto',
      ),
      themeMode: ThemeMode.system,
      home: const HomeScreen(),
    );
  }
}

/// Pantalla inicial (placeholder)
class HomeScreen extends StatelessWidget {
  const HomeScreen({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('GlobalFin'),
        centerTitle: true,
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            const Text(
              'Bienvenido a GlobalFin',
              style: TextStyle(fontSize: 24, fontWeight: FontWeight.bold),
            ),
            const SizedBox(height: 20),
            const Text(
              'Aplicación móvil en construcción',
              style: TextStyle(fontSize: 16, color: Colors.grey),
            ),
            const SizedBox(height: 40),
            ElevatedButton(
              onPressed: () {
                ScaffoldMessenger.of(context).showSnackBar(
                  const SnackBar(content: Text('Feature en desarrollo')),
                );
              },
              child: const Padding(
                padding: EdgeInsets.symmetric(horizontal: 30, vertical: 15),
                child: Text('Comenzar'),
              ),
            ),
          ],
        ),
      ),
    );
  }
}
