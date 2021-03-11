package com.nazarov.javadeveloper.module24.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Date;


@Data
@NoArgsConstructor
@Table(name = "files")
@Entity
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @EqualsAndHashCode.Exclude
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Column(name = "size")
    private Float size;

    @Enumerated(value = EnumType.STRING)
    private FileStatus status;

    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    @Column(name = "created")
    private Date created;

    @Temporal(TemporalType.TIMESTAMP)
    @UpdateTimestamp
    @Column(name = "last_modified")
    private Date lastModified;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @ToString.Exclude
    private User user;

    public File(String path) {
        java.io.File file = new java.io.File(path);
        try {
            this.size = (float) Files.size(file.toPath());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        String[] f = file.getName().split("\\.");
        this.name = f[0];
        this.type = f[1];
        this.status = FileStatus.ACTIVE;
    }

    public String getFileName(){
        return name + "." + type;
    }
}