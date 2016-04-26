package net.aknyazev.game.editor.model;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import net.aknyazev.game.editor.Constants;

/**
 * Author: MrKnyaz
 * Date: 05.02.14
 */
public class SpriteObject extends AbstractGameObject {
    TextureRegion region;
    String name;

    public SpriteObject(TextureRegion region, String name) {
        this.region = region;
        this.name = name;
    }

    public void draw(SpriteBatch batch) {
        float spriteWidth = region.getRegionWidth()/ Constants.PIXPERUNIT * scaleX;
        float spriteHeight = region.getRegionHeight()/Constants.PIXPERUNIT * scaleY;
        batch.draw(region, posX-spriteWidth/2, posY-spriteHeight/2, spriteWidth, spriteHeight);
    }

    public TextureRegion getRegion() {
        return region;
    }

    public void setRegion(TextureRegion region) {
        this.region = region;
    }

    public SpriteObject copy() {
        SpriteObject result = new SpriteObject(region, name);
        result.setPosX(posX);
        result.setPosY(posY);
        result.setRotation(rotation);
        result.setScaleX(scaleX);
        result.setScaleY(scaleY);
        return result;
    }

    public String toString() {
        return region.toString();
    }
}
