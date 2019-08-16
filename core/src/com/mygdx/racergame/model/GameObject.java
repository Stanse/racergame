package com.mygdx.racergame.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public abstract class GameObject {

    Rectangle bounds;
    Sprite objeSprite;

    public GameObject(Texture texture, float x, float y, float width, float height){
        bounds = new Rectangle(x,y,width,height);
        objeSprite = new Sprite(texture);

    }

    public void draw(SpriteBatch batch){
        objeSprite.setBounds(bounds.getX(), bounds.getY(), bounds.getWidth(), bounds.getHeight());
        objeSprite.draw(batch);
    }
}
