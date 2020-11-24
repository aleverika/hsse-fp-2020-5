$ определить предикат mrg(L1, L2, R) который для двух отсортированных списков L1 и L2 
% определяет список R, составленный из этих элементов

mrg([],[], []).
mrg(L1, [], L1).
mrg([], L2, L2).
mrg([X|L1], [Y|L2], [X|R]):- X =< Y, mrg(L1, [Y|L2], R).
mrg([X|L1], [Y|L2], [Y|R]):- X > Y, mrg([X|L1], L2, R).
