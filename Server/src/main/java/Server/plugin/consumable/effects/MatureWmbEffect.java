package plugin.consumable.effects;

import core.game.node.entity.player.Player;
import plugin.consumable.ConsumableEffect;
import plugin.skill.Skills;

public class MatureWmbEffect extends ConsumableEffect {

    private final static int healing = 1;

    @Override
    public void activate(Player p) {
        int magicLevelBoost = 3;
        if (p.getSkills().getLevel(Skills.MAGIC) > 50) {
            magicLevelBoost++;
        }
        final MultiEffect effect = new MultiEffect(new IncrementSkillEffect(Skills.MAGIC, magicLevelBoost, 0), new HealingEffect(healing), new IncrementSkillEffect(Skills.ATTACK, -5, 0), new IncrementSkillEffect(Skills.STRENGTH, -5, 0), new IncrementSkillEffect(Skills.DEFENCE, -5, 0));
        effect.activate(p);
    }

    @Override
    public int getHealthEffectValue(Player player) {
        return healing;
    }
}