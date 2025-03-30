theme: /

    state: ПолучениеТаро
        q!: (~таро|~предсказание|~предсказать|~гадание|~гадать) 
            
        script:
            log('getTaro: context: ' + JSON.stringify($context))
            
            var taroAnswer = getTaro($context);

            $reactions.answer({
                "value": "Ты - " + taroAnswer,
            });
