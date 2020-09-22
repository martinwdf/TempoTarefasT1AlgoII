# TempoTarefasT1AlgoII
A que horas vai terminar isso aí?
Voê está trabalhando em uma grande empresa que virtualiza soluções na nuvem. Isso é tudo
muito motivador, disruptivo, inovador e quântio, mas tem problemas omo qualquer empresa
e voê agora tem que resolver um deles: seus lientes querem proessar grandes onjuntos de
tarefas que preisam ser feitas na ordem erta e levam tempos diferentes para serem realizadas. Se
eles omprarem apenas um proessador da sua nuvem, é laro que o tempo de ompletar tudo
será a soma de todos os tempos das tarefas, mas quanto tempo demora se eles omprarem dois
proessadores? E três? E quatro? E ento e quarenta e dois? Voê está ansado de fazer ontinhas
à mão para responder esse tipo de pergunta e resolveu automatizar o álulo.
Voê reebe dos lientes um esquema das tarefas que devem ser proessadas: é uma longa lista
de nomes de tarefas omo na listagem abaixo, onde
blabla_213 -> tititi_53
signia que a tarefa blabla_213 deve ser realizada antes que a tarefa tititi_53 possa ser iniiada.
Tentando desenhar todas as onexões que existem na listagem abaixo, voê termina om um
desenho omo o que está à direita. Voê sabe que o número que faz parte do nome de ada tarefa
india quanto tempo ela leva para ser realizada.
# Pro 4
lsq_263 -> yuqfx_370
llkgx_112 -> lsq_263
llkgx_112 -> ubf_402
gh_225 -> llkgx_112
gh_225 -> stxd_282
gh_225 -> rhkhp_104
gh_225 -> ilt_48
evdpw_387 -> gh_225
evdpw_387 -> fb_149
ubf_402 -> wiv_201
stxd_282 -> wh_360
stxd_282 -> su_393
bbn_214 -> evdpw_387
rhkhp_104 -> wx_222
rhkhp_104 -> rnhso_338
fb_149 -> llmj_337
fb_149 -> kveba_91
fb_149 -> ld_234
ab_70 -> bbn_214
ab_70 -> lu_428
ab_70 -> a_475
ilt_48 -> uouhl_481
a_475 -> vhn_483
vhn_483 -> jl_442
lsq_263
yuqfx_370
llkgx_112
ubf_402
wiv_201
gh_225
stxd_282 rhkhp_104 ilt_48
wh_360 su_393 wx_222 rnhso_338 uouhl_481
evdpw_387
fb_149
llmj_337 kveba_91 ld_234
bbn_214
ab_70
lu_428 ac_475
cvhn_483
jl_442
Voê tem algumas informações extras:
• A linha iniial
# Pro n
india quantos proessadores vão ser usados para as tarefas.
• Só um proessador pode trabalhar em ada tarefa e a tarefa é terminada sem interrupção;
• Diversos proessadores podem trabalhar em tarefas ao mesmo tempo para terminar o mais
depressa possível;
• Quando uma tarefa está livre para ser realizada um proessador oioso (se houver) é imediatamente aloado para o trabalho;
• Quando existem várias tarefas que podem ser esolhidas, voê oferee duas polítias de
esolha:
 Polítia MIN: um proessador é aloado para a tarefa que leva menos tempo (2178
unidades de tempo neste exemplo);
 Polítia MAX: um proessador é aloado para a tarefa que leva mais tempo (2337
unidades de tempo neste exemplo).
 ATENÇO: em aso de empate neste ritério, será feita a tarefa ujo nome vem primeiro
alfabetiamente: blabla vem antes de tititi e tem preferênia se as duas tarefas
tiverem a mesma duração.
Voê deve esrever o programa para enontrar o tempo de realização das tarefas de aordo om
ada uma das polítias para que seu liente possa esolher qual vai ser usada, depois testá-lo om
os arquivos oloados na página da disiplina e entregar um relatório ontando:
• Qual o problema sendo resolvido;
• Como o problema foi modelado;
• Como é o proesso de solução, apresentando exemplos e algoritmos;
• Os resultados dos asos de teste;
• Conlusões.
