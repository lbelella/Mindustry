package mindustry.maps.planet;

import arc.graphics.*;
import arc.math.geom.*;
import mindustry.type.*;
import mindustry.world.*;

public interface PlanetGenerator{
    float getHeight(Vec3 position);
    Color getColor(Vec3 position);
    void generate(Vec3 position, TileGen tile);
    void decorate(Tiles tiles, Sector sec);
}