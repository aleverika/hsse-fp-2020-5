% ���������� �������� qsort(L, K) ������� ��� ��������� ������ ����� ����� ���������� ���������������
qsort([],[]).
qsort([Head | Tail], K) :- qsort(Tail, S), insert(Head, S, K).

%insert - �������������� ��������������� ��������
insert(X,[Head | Tail],[Head | Tail2]) :- X > Head, insert(X, Tail, Tail2).
insert(X, Tail, [X | Tail]).

/*
������ ����������� ������:
?- qsort([1,4,3,2,8,16,1,-18,30],K).
K = [-18, 1, 1, 2, 3, 4, 8, 16, 30]

?- qsort([-2,10,16,8,11,4,-1,0,9],K).
K = [-2, -1, 0, 4, 8, 9, 10, 11, 16]
*/
