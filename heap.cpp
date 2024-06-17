#include <iostream>
#include <vector>
#include <algorithm> // para std::swap

void heapifyMax(std::vector<int>& heap, int n, int i) {
    int largest = i;      // Inicializar el nodo más grande como raíz
    int left = 2 * i + 1; // hijo izquierdo
    int right = 2 * i + 2; // hijo derecho

    // Si el hijo izquierdo es mayor que la raíz
    if (left < n && heap[left] > heap[largest])
        largest = left;

    // Si el hijo derecho es mayor que el nodo más grande encontrado hasta ahora
    if (right < n && heap[right] > heap[largest])
        largest = right;

    // Si el nodo más grande no es la raíz
    if (largest != i) {
        std::swap(heap[i], heap[largest]);
        // Heapificar el subárbol afectado
        heapifyMax(heap, n, largest);
    }
}

void buildMaxHeap(std::vector<int>& heap) {
    int n = heap.size();

    // Construir el heap (reorganizar el array)
    for (int i = n / 2 - 1; i >= 0; i--) {
        heapifyMax(heap, n, i);
    }
}

void printHeap(const std::vector<int>& heap) {
    for (int val : heap)
        std::cout << val << " ";
    std::cout << std::endl;
}

int main() {
    std::vector<int> data = {30, 20, 15, 5, 10, 12, 6};

    buildMaxHeap(data);

    std::cout << "Max-Heap: ";
    printHeap(data);

    return 0;
}
