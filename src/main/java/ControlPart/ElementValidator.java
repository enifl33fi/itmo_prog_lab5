package ControlPart;

import element.*;
import exceptions.IdCollapseException;
import exceptions.NullFieldException;
import exceptions.WrongCommandException;
import exceptions.WrongFieldException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class ElementValidator {
    public String validateName(String name) {
        if (name.equals("") || name == null) {
            throw new NullFieldException("name");
        }
        if (name.contains(",")) {
            throw new WrongFieldException("name cannot contain commas");
        }
        return name;
    }

    public int validateX(String xStr) {
        int x = Integer.parseInt(xStr);
        if (x > 201) {
            throw new WrongFieldException("The value of the field x must be less than or equal to 201.");
        }
        return x;
    }

    public int validateY(String yStr) {
        int y = Integer.parseInt(yStr);
        if (y <= -440) {
            throw new WrongFieldException("The value of the y field must be greater than -440.");
        }
        return y;
    }

    public Double validateHealth(String healthStr) {
        Double health = null;
        if (healthStr.equals("")) {
            return health;
        }
        health = Double.parseDouble(healthStr);
        if (health <= 0) {
            throw new WrongFieldException("The value of the field health must be greater than 0.");
        }
        return health;
    }

    public int validateHeartCount(String heartCountStr) {
        int heartCount = Integer.parseInt(heartCountStr);
        if (heartCount <= 0 || heartCount > 3) {
            throw new WrongFieldException("The value of the field heartCount must be greater than 0.The value of the heartCount field must be less than or equal to 3.");
        }
        return heartCount;
    }

    public AstartesCategory validateCategory(String categoryStr) {
        AstartesCategory category = null;
        if (categoryStr.equals("")) {
            return category;
        }
        category = AstartesCategory.valueOf(categoryStr);
        return category;
    }

    public MeleeWeapon validateMeleeWeapon(String meleeWeaponStr) {
        MeleeWeapon meleeWeapon = null;
        if (meleeWeaponStr.equals("")) {
            return meleeWeapon;
        }
        meleeWeapon = MeleeWeapon.valueOf(meleeWeaponStr);
        return meleeWeapon;
    }

    public String validateChapterName(String chapterName) {
        if (chapterName.equals("") || chapterName == null) {
            throw new NullFieldException("chapterName");
        }
        if (chapterName.contains(",")) {
            throw new WrongFieldException("chapterName cannot contain commas");
        }
        return chapterName;
    }

    public Integer validateMarinesCount(String marinesCountStr) {
        Integer marinesCount = Integer.parseInt(marinesCountStr);
        if (marinesCount <= 0 || marinesCount > 1000) {
            throw new WrongFieldException("The value of the field marinesCount must be greater than 0, the maximum value of the field: 1000.");
        }
        return marinesCount;
    }

    public long validateId(String idStr, List<Long> ids) {
        long id = Long.parseLong(idStr);
        if (ids.contains(id)) {
            throw new IdCollapseException();
        }
        return id;
    }

    public Date validateCreationDate(String creationDateStr) throws ParseException {
        Date creationDate = new Date();
        if (creationDateStr != null) {
            creationDate = new SimpleDateFormat("EEE MMM dd kk:mm:ss z yyyy", Locale.ENGLISH).parse(creationDateStr);
        }
        return creationDate;
    }

    public SpaceMarine validateSpaceMarine(String name, String xStr, String yStr, String healthStr, String heartCountStr, String categoryStr, String meleeWeaponStr, String chapterName, String marinesCountStr, String idStr, List<Long> ids, String creationDateStr) throws ParseException {
        name = this.validateName(name);
        int x = this.validateX(xStr);
        int y = this.validateY(yStr);
        Coordinates coordinates = new Coordinates(x, y);
        Double health = this.validateHealth(healthStr);
        int heartCount = this.validateHeartCount(heartCountStr);
        AstartesCategory category = this.validateCategory(categoryStr);
        MeleeWeapon meleeWeapon = this.validateMeleeWeapon(meleeWeaponStr);
        chapterName = this.validateChapterName(chapterName);
        Integer marinesCount = this.validateMarinesCount(marinesCountStr);
        Chapter chapter = new Chapter(chapterName, marinesCount);
        long id = this.validateId(idStr, ids);
        Date creationDate = this.validateCreationDate(creationDateStr);
        return new SpaceMarine(name, coordinates, health, heartCount, category, meleeWeapon, chapter, id, creationDate);
    }

    public SpaceMarine validateSpaceMarine(String[] args) {
        String name = this.validateName(args[0]);
        int x = this.validateX(args[1]);
        int y = this.validateY(args[2]);
        Coordinates coordinates = new Coordinates(x, y);
        Double health = this.validateHealth(args[3]);
        int heartCount = this.validateHeartCount(args[4]);
        AstartesCategory category = this.validateCategory(args[5]);
        MeleeWeapon meleeWeapon = this.validateMeleeWeapon(args[6]);
        String chapterName = this.validateChapterName(args[7]);
        Integer marinesCount = this.validateMarinesCount(args[8]);
        Chapter chapter = new Chapter(chapterName, marinesCount);
        return new SpaceMarine(name, coordinates, health, heartCount, category, meleeWeapon, chapter);
    }
}
