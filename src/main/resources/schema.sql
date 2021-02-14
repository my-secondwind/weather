DROP TABLE IF EXISTS CloudinessInfo;

CREATE TABLE operation
(
    id                 LONG PRIMARY KEY,
    startDate          DATE         NOT NULL,
    endDate            DATE         NOT NULL,
    clearDay           INT,
    slightlyCloudyDay  INT,
    cloudyDay          INT,
    overcastDay        INT
);