***QuickSort(A as array, int low, int high)*** <br>
&nbsp;&nbsp;&nbsp;&nbsp;***if*** (low<high)<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;pivot_location = ***Partition***(A, low, high)<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;***Quicksort***(A, low, pivot_location)<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;***Quicksort***(A, pivot_locatin + 1, high)


***Partition(A as array, int low, int high)***<br>
&nbsp;&nbsp;&nbsp;&nbsp;pivot = A[low]<br>
&nbsp;&nbsp;&nbsp;&nbsp;leftwall = low<br>

***for*** i = low + 1 to high<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;***if*** (A[i] < pivot) ***then***<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;***swap***(A[i], A[leftwall])<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;leftwall = leftwall + 1<br>

&nbsp;&nbsp;&nbsp;&nbsp;***swap***(pivot, A[leftwall])<br>

&nbsp;&nbsp;&nbsp;&nbsp;return (leftwall)